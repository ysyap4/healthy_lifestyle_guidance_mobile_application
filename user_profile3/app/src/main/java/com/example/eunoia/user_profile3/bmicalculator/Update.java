package com.example.eunoia.user_profile3.bmicalculator;

/**
 * Created by username on 16/5/2016.
 */
public class Update {

        private String userName;
        private double weight;
        private double height;
        private double water;

        public Update()
        {
            this.userName=null;
            this.weight=0.0;
            this.height=0.0;
            this.water=0.0;
        }
        public Update(String userName, double weight, double height)
        {
            super();
            this.userName=userName;
            this.weight=weight;
            this.height=height;
            this.water=0;
        }
        public String getName() { return userName; }
        public void setName(String userName)
        {
            this.userName=userName;
        }
        public String getWeight()
        {
            return Double.toString(weight);
        }
        public void setWeight(double weight)
        {
            this.weight=weight;
        }
        public String getHeight()
        {
            return Double.toString(height);
        }
        public void setHeight(double height)
        {
            this.height=height;
        }
        public double getWater()
        {
            double weight_pound;
            weight_pound = weight * 2.20462;
            water = 0.029574*2*weight_pound/3;
            return water;

        }
    public int getId(){ return 1;}
}
