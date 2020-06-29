public class MyJVMTest{
    public void foo(int id , String name){
        String tmp = "A";
    }
    public static void foo2(){
        //locals=0 max_locals=0
        if(true){
            //locals=1,max_locals=1
            String a = "a";
        }

        //locals=0 max_locals=1
        if(true){
            //locals=1 ,max_locals=1
            String b = "b";
        }

        //locals=0 max_locals=1
    }

    public void foo3(){
        double a = 1L;
        int b = 10;
        long c = 100;
        int d = 10;
    }
}