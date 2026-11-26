package package1;

// package is a folder where we can have lot of class files and other folder will be avaliable inside. 

/* 

eg: class A is in package1 if we want to use class in other we can use import package1.A.
if we want to get all files in the package we can use import package1.*; it will retrieve only files not folder or packages in it.
if we have nested packages we can use like package1.pack.*; every time u use * to access all class in that folder or package..

*/

public class A {
    private int marks;
    // to access this instance variable from other class or package we need to have getters abd setters methods..

    public void setMarks(int marks){
        this.marks = marks; // for set we wont return here...
    }
    public int getMarks(){
        return marks;  // we will return here...
    }
}
