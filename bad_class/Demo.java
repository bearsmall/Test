public class Demo{
    static {
        try{
	Runtime rt = Runtime.getRuntime();
	String[] commands={"calc"};
	Process p = rt.exec(commands);
	System.out.println("success");
	p.waitFor();
        }catch(Exception e){
	System.out.println(e);
        }
    }
//public static void main(String[] args){

//}

}