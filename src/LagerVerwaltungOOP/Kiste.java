package LagerVerwaltungOOP;

public class Kiste {
        private int ID, width, height, length;
        public Kiste(int id) {
            this.ID=id;
        }
        @Override
        public String toString() {

            String string=
                    "-".repeat(50)+"\n"+
                    "Kiste{" +
                    "ID=" + ID +
                    ", width=" + width +
                    ", height=" + height +
                    ", length=" + length;
            System.out.println(string);
            return string;
        }


    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getID() {
        return ID;
    }
}
