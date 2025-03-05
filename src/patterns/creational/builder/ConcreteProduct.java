package patterns.creational.builder;

import patterns.creational.Product;

public final class ConcreteProduct implements Product {
    private final String partA;
    private final String partB;

    private ConcreteProduct(Builder builder) {
        this.partA = builder.partA;
        this.partB = builder.partB;
    }

    public String getPartA() {
        return partA;
    }

    public String getPartB() {
        return partB;
    }

    @Override
    public void use() {
        System.out.println("Using ConcreteProduct");
    }

    @Override
    public void show() {
        System.out.println("Product with " + partA + " and " + partB);
    }

    @Override
    public String toString() {
        return "Product with " + partA + " and " + partB;
    }

    public static class Builder {
        private String partA;
        private String partB;

        public Builder setPartA(String partA) {
            this.partA = partA;
            return this;
        }

        public Builder setPartB(String partB) {
            this.partB = partB;
            return this;
        }

        public ConcreteProduct build() {
            if (partA == null || partB == null) {
                throw new IllegalStateException("Both partA and partB must be set.");
            }
            return new ConcreteProduct(this);
        }
    }
}