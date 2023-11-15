class Funcao {
    public double a, b, c;

    //construtor
    public Funcao(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Implementar o cálculo das raízes aqui usando a, b e c
    public void raizes() {
        double delta = Math.pow(b, 2) - 4 * a * c;

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else if (delta == 0) {
            double raiz = -b / (2 * a);
            System.out.println("A equação possui uma raiz real: " + raiz);
        } else {
            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("A equação possui duas raízes reais: " + raiz1 + " e " + raiz2);
            if(raiz1==raiz2){
                System.out.println("A equação possui duas raízes iguais: ");
            }
        }
    }
}
