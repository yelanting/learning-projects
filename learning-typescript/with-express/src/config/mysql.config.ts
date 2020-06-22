const devConfig = {
    host: "localhost",
    database: "with_express",
    user: "root",
    password: "Admin@1234"
}

const prodConfig = {
    host: "localhost",
    database: "with_express",
    user: "root",
    password: "Admin@1234"
}
export const mysqlConfig = process.env.NODE_ENV === "development" ? devConfig : prodConfig;
