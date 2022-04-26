package dangbao.st.ueh.edu.vn.dao;

public class Ban {
    String idBan;
    String tenBan;
    byte trangThai;
    String idTang;
    String idLoaiBan;

    public String getIdBan() {
        return idBan;
    }

    public void setIdBan(String idBan) {
        this.idBan = idBan;
    }

    public String getTenBan() {
        return tenBan;
    }

    public void setTenBan(String tenBan) {
        this.tenBan = tenBan;
    }

    public byte getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(byte trangThai) {
        this.trangThai = trangThai;
    }

    public String getIdTang() {
        return idTang;
    }

    public void setIdTang(String idTang) {
        this.idTang = idTang;
    }

    public String getIdLoaiBan() {
        return idLoaiBan;
    }

    public void setIdLoaiBan(String idLoaiBan) {
        this.idLoaiBan = idLoaiBan;
    }

    public Ban() {
    }

    public Ban(String tenBan, byte trangThai, String idTang, String idLoaiBan) {
        this.tenBan = tenBan;
        this.trangThai = trangThai;
        this.idTang = idTang;
        this.idLoaiBan = idLoaiBan;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "idBan='" + idBan + '\'' +
                ", tenBan='" + tenBan + '\'' +
                ", trangThai=" + trangThai +
                ", idTang='" + idTang + '\'' +
                ", idLoaiBan='" + idLoaiBan + '\'' +
                '}';
    }
}
