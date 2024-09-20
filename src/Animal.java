public class Animal {
    private String tamanho;
    private int numeroPernas;
    private int numeroOlhos;

    public Animal (String tamanho, int numeroPernas, int numeroOlhos) {
        this.tamanho = tamanho;
        this.numeroPernas = numeroPernas;
        this.numeroOlhos = numeroOlhos;
    }

    public Animal (){

    }

    public void conversar (Quadrupede q) {
        if (q instanceof Cachorro) {
            Cachorro c = (Cachorro) q;
            c.latir();
        } else if (q instanceof Girafa) {
            Girafa g = (Girafa) q;
            g.barulho();
        } else if (q instanceof Javali) {
            Javali j = (Javali) q;
            j.barulhoJavali();
        }
    }

    public void conversarPoli (Quadrupede q) {
        q.olaBixo();
    }
}
