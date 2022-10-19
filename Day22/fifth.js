var person={
  'fname':'Jack',
  'lname':'Jones',
  age:45,
  greet:function(){
    console.log("Welcome "+person.fname+" "+person.lname);
  }
}

console.log(typeof person.greet);

person.greet();