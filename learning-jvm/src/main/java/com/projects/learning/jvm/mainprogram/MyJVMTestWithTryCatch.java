import java.io.FileOutputStream;
import java.io.IOException;
public class MyJVMTestWithTryCatch{
    public static class MyException1 extends Exception{

    }

    public void tryItOut1() throws MyException1{

    }

    public void handleException(){

    }

    public void handleFinally(){

    }
    
    public void foo(){
        try{
            tryItOut1();
        }catch(MyException1 e){
            handleException();
        }
    }

    public void fooMultiException(){
        try{
            tryItOut1();
        }catch(MyException1 e){
            handleException();
        }catch(Exception e1){
            handleException();
        }
    }

    public void fooWithFinally(){
        try{
            tryItOut1();
        }catch(MyException1 e){
            handleException();
        }finally{
            handleFinally();
        }
    }

    public int tryCatchWithFinalliAndModifyReturnValue(){
        int i = 100;

        try{
            return i;
        }finally{
            ++i;
        }
    }

    public String tryCatchWithFinallyAndModifyReturn(){
        String s = "hello";
        try{
            return s ;
        }finally{
            s = "xyz";
        }
    }

    public static void tryCatchDemoWithFinallyCommon() throws IOException{
        FileOutputStream in = null;
        try{
            in = new FileOutputStream("test.txt");
            in.write(1);
        }finally{
            if(null != in){
                in.close();
            }
        }
    }

    public static void tryCatchDemoWithResource() throws IOException{
        try(FileOutputStream in = new FileOutputStream("test.txt")){
            in.write(1);
        }
    }
}