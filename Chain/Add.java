public class Add implements Handler{

    private Handler Next;

    @Override
    public void setNext(Handler next) {
        // TODO Auto-generated method stub
        Next = next;
        
    }

    @Override
    public void calc(Numbers input) {
        // TODO Auto-generated method stub

        if(input.getReq().contains("add")){
            System.out.println(input.getN1()+input.getN2());
        }else{
            Next.calc(input);
        }
        
    }
    
}
