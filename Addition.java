public class Addition{

    private int first_value, second_value;
    // private int second_value;
    private int result;


    public Addition(int first_value, int second_value){
        this.first_value = first_value;
        this.second_value = second_value;
    }

    public int sum(){
        this.result = this.first_value + this.second_value;
        return this.result;
    }
}