var print=function(){
  console.log("Hello");
}
console.log(print);
console.log("=====================");
print=function(name){
  console.log("Welcome "+name);
}
console.log(print);
console.log("=====================");
print=function(fname,lname){
  console.log("Hi "+fname+" "+lname);
}
console.log(print);
print();   //
print("Fergus");
print("Sam","Hill");