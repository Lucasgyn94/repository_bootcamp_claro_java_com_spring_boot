package one.digitalInnovation.gof.singleton;

/*
* Singleton "preguiçoso"
* */

public class SingletonLazy {
        private static SingletonLazy instancia;

        private SingletonLazy() {
            super();// chamando construtor da classe pai
        }

        public static SingletonLazy getInstancia() {
            if (instancia == null) {
                instancia = new SingletonLazy();
            }

            return instancia;
        }
}
