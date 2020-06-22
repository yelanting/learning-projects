import * as mysql from "mysql";
import * as mysqlConfig from "../config/mysql.config";

export function db(sql: string, arg: any, callback?: any) {
    const connection = mysql.createConnection(mysqlConfig.mysqlConfig);

    connection.connect();

    connection.query(sql, arg, (err: any, data: any) => {
        callback(err, data);
    });

    connection.end();

}