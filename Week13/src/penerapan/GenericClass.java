package penerapan;


class GenericClass<T> {
    
    //T Adalah Kepanjangan dari Tipe Parameter
    private T Orang;
    
    //Method Void Set Dengan Tipe Parameter T
    protected void setOrang(T Orang){
        this.Orang = Orang;
    }
    
    //Method Return Get Yang Mengembalikan Nilai Orang
    protected T getOrang(){
        return Orang;
    }
}