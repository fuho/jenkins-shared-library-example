class acme implements Serializable {
    private String name
    def setName(value) {
        name = value
    }
    def getName() {
        name
    }
    def caution(message) {
        "Hello, ${name}! CAUTION: ${message}"
    }
}