const path = require('path');
const webpack = require('webpack');




/*
 * SplitChunksPlugin is enabled by default and replaced
 * deprecated CommonsChunkPlugin. It automatically identifies modules which
 * should be splitted of chunk by heuristics using module duplication count and
 * module category (i. e. node_modules). And splits the chunks…
 *
 * It is safe to remove "splitChunks" from the generated configuration
 * and was added as an educational example.
 *
 * https://webpack.js.org/plugins/split-chunks-plugin/
 *
 */

/*
 * We've enabled TerserPlugin for you! This minifies your app
 * in order to load faster and run less javascript.
 *
 * https://github.com/webpack-contrib/terser-webpack-plugin
 *
 */

const TerserPlugin = require('terser-webpack-plugin');

const HtmlWebpackPlugin = require('html-webpack-plugin');

var ROOT_PATH = path.resolve(__dirname)
var APP_PATH = path.resolve(ROOT_PATH, "app")
var BUILD_PATH = path.resolve(ROOT_PATH, "build")

module.exports = {
    mode: 'development',
    entry: {
        app: path.resolve(APP_PATH, "app.jsx")
    },
    output: {
        path: BUILD_PATH,
        filename: "bundle.js"
    },
    devtool: "eval-source-map",
    devServer: {
        historyApiFallback: true,
        hot: true,
        inline: true,
        progress: true
    },
    plugins: [new webpack.ProgressPlugin(),
        new HtmlWebpackPlugin({
            title: "My first react app"
        })
    ],
    resolve: {
        extensions: ['', '.js', '.jsx']
    },
    module: {
        preLoaders: [{
            test: /\.jsx?$/,
            loaders: ['eslint'],
            include: APP_PATH
        }],
        rules: [{
            test: /\.(js|jsx)$/,
            include: [path.resolve(__dirname, 'src')],
            loader: 'babel-loader'
        }, {
            test: /.css$/,

            use: [{
                loader: "style-loader"
            }, {
                loader: "css-loader",

                options: {
                    sourceMap: true
                }
            }]
        }]
    },

    optimization: {
        minimizer: [new TerserPlugin()],

        splitChunks: {
            cacheGroups: {
                vendors: {
                    priority: -10,
                    test: /[\\/]node_modules[\\/]/
                }
            },

            chunks: 'async',
            minChunks: 1,
            minSize: 30000,
            name: false
        }
    }
}