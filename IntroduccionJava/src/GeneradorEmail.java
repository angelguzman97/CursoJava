public class GeneradorEmail {
    public static void main(String[] args) {
        var nombre = " Ubaldo Acosta Soto ";

        var empresa = "  Global Mentoring";
        var dominio = ".com.mx";
        System.out.println("nombre = " + nombre);
        System.out.println("empresa = " + empresa);
        var nombreUsuario = nombre.trim();
        var nombreEmpresa = empresa.trim();
        System.out.println("nombreUsuario = " + nombreUsuario + "\nnombreEmpresa = " + nombreEmpresa);
        var nombreUsuarioNomralizado = nombreUsuario.replace(' ','.').toLowerCase();
        System.out.println("nombreUsuarioNomralizado = " + nombreUsuarioNomralizado);

        var dominioEmailNormalizado = "@"+nombreEmpresa.concat(dominio).replace(' ','.').toLowerCase();
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);

        var email = nombreUsuarioNomralizado.concat(dominioEmailNormalizado);
        System.out.println("email = " + email);

    }
}
