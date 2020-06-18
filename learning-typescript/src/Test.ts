function* generator() {
    const who = yield;
    console.log("hello " + who);
}

const iterator = generator();

console.log(iterator.next());


console.log(iterator.next("TypeScript"));