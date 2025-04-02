//package Revision.CodingQuestions;
//
//import org.testng.annotations.BeforeTest;
//
//import java.util.Stack;
//
//public class Test {
//
//    public static void main(String[] args){
//        String str="][";
//        System.out.println(findvalidParenthesis(str));
//
//        int arr[] = { 12, 11, 13, 5, 6, 7 };
//        /*
//        12,11,13     5,6,7
//        12,11  13     5,6   7
//        ,
//         */
//       int n=arr.length;
//       mergeSort(arr,0,n);
//
//
//    }
//
//    public static void mergeSort(int[] arr,int start,int end){
//        if(==1){
//            return;
//        }
//        mergeSort(arr,start,end/2);
//
//        mergeSort(arr,end/2+1,end);
//
//
//
//    }
//
//    /*
//    'https://dummyjson.com/RESOURCE/?limit=10&skip=5&select=key1&select=key2&select=key3'
//
//     */
//
//    /*
//    @BeforeTest
//    public static void setup(){
//    HashMap<String,Object> hashmap=new hashMap<>();
//    hashmap.put("limit","10");
//    hashmap.put("skip","5");
//    hashmap.put("select",key1");
//    hashmap.put("select","key2");
//    hashmap.put("select","key3);
//
//
//        RequestSpecBuilder requestSpecBuilder=new RequestSpecBuilder();
//        requestSpectBuilder.setBaseURI("https://dummyjson.com").
//        addQueryParams("","","","","").
//        addheader("","");
//
//        RestAssured.RequestSpecification=requestSpecBuilder.build();
//
//        ResponseSpecBuilder responseSpecBuilder=new ResponseSpecBuilder();
//        responseSpecBuilder.expectStatusCode(200);
//
//        @Test
//        Response response=with.spec(requestSpecification).get("RESOURCE").extract().response();
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//     */
//
//
//
//    public static boolean findvalidParenthesis(String str){
//        Stack<Character> st=new Stack<>();
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch=='[' || ch=='{' || ch=='('){
//                st.push(ch);
//            }
//            else if((ch==']' || ch=='}' || ch==')') && !st.isEmpty() ){
//                st.pop();
//            }
//        }
//        if(st.isEmpty()){
//            return true;
//        }
//        return false;
//
//    }
//
//
//
//
//}
