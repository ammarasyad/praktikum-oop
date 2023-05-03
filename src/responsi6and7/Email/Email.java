package responsi6and7.Email;

public class Email {
    private String email;
    public Email(String email) {
        this.email = email;
    };

    public boolean validateEmail() throws InvalidEmailException, InvalidDomainException {
        /**
         * Implementasi dengan aturan:
         * Aturan email
         * - Email harus mengandung tepat 1 karakter @ ditengah email
         * - Bagian sebelum @ tidak boleh kosong
         * - Bagian email setelah @ harus memiliki tepat 1 buah titik (.)
         * - Email hanya akan mengandung huruf, angka, (@), dan (.). Karakter lain tidak
         * perlu diperiksa
         *
         * "john@example.com" => Email Valid
         * "jane.doe@gmail.com" => Email Valid
         * "" => mengembalikan pesan "Email tidak boleh kosong"
         * "example.com" => mengembalikan pesan "Email harus mengandung tepat satu buah @"
         * "@example.com" => mengembalikan pesan "@ tidak boleh di awal email"
         * "john@com" => mengembalikan pesan "Email harus memiliki domain yang valid"
         */
        if (email.isEmpty()) {
            throw new InvalidEmailException("Email tidak boleh kosong");
        }

        if (!email.contains("@") || email.chars().filter(ch -> ch == '@').count() > 1) {
            throw new InvalidEmailException("Email harus mengandung tepat satu buah @");
        }

        if (email.startsWith("@")) {
            throw new InvalidEmailException("@ tidak boleh di awal email");
        }

        String[] emailSplit = email.split("@");
        String domain = emailSplit[1];

        if (domain.chars().filter(ch -> ch == '.').count() != 1 || domain.endsWith(".") || domain.startsWith(".")) {
            throw new InvalidDomainException();
        }

        return true;
    }

}

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

class InvalidDomainException extends Exception {
    public String getMessage() {
        // Implementasi custom message InvalidDomainException
        // Return pesan multak berisi: "Email harus memiliki domain yang valid
        return "Email harus memiliki domain yang valid";
    }
}