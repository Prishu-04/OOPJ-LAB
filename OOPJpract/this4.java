class this4{
    void m(this4 obj){
        System.out.println("method is invoked");
    }
    void p(){
        m(this);   // passing current object
    }
    public static void main(String args[]){
        this4 s1 = new this4();
        s1.p();
    }
}
