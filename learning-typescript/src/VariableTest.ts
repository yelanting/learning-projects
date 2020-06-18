function hello<T>(arg: T[]): T[]{
    console.log(arg.length);
    return arg;
}

let output = hello<string>(["strig hello","2"]);


let output2 = hello<number>([2,3,4]);
