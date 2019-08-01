package domain;

public class Gender {

    private int id;
    private String desc;

    private Gender(){

    }

    public Gender(Builder builder){

        this.id = builder.id;
        this.desc = builder.desc;

    }


    public int getId(){
        return id;
    }

    public String getDesc(){
        return desc;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }


    public static class Builder {

        private int id;
        private String desc;

        public Builder id(int id){

            this.id = id;
            return this;

        }

        public Builder desc(String desc){

            this.desc = desc;
            return this;

        }

        public Gender build(){

            return new Gender(this);

        }


    }


}
