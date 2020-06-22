import * as colors from "colors";
import { program } from "commander";

const args = process.argv;

console.log(args);

program.version("0.0.1").
    option("-V,--version", "output the version number").
    option("-c,--city [name]", "add city name").
    option("-h,--help", "output usage information").
    parse(process.argv);

if (!program.city) {
    program.outputHelp(colors.red);
}

if (process.argv.slice(2).length === 0) {
    program.outputHelp(colors.red);
    process.exit();
}
