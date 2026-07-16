package v.s;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class OHTCdIMQ8dDzHn2uIc {
    public Box5SCj0ZNnLNdOqQxT D5P1xCAyuvgF;
    public KRdIG73TbWYS Ee8d2j4S9Vm5yGuR;
    public String JXn4Qf7zpnLjP5;
    public Box5SCj0ZNnLNdOqQxT b1EoSIRjJHO5;
    public iniVyKd0OGb2raI4 dDIMxZXP1V8HdM;
    public D9RooUzwy6gf47M9NDX gIIiyi2ddlMDR0;
    public long gmNWMfvn6zlEj;
    public long hjneShqpF9Tis4;
    public T3JeDzw7Re7Z ibVTtJUNfrGYbW;
    public Box5SCj0ZNnLNdOqQxT pyu8ovAipBTLYAiKab;
    public B62d1BWQ36VxGmXU w9sT1Swbhx3hs;
    public int vekpFI4d1Nc4fakF = -1;
    public r5XEUfod5GSCCwq6c xDyLpEZyrcKVe0 = new r5XEUfod5GSCCwq6c(11);

    public static void w9sT1Swbhx3hs(String str, Box5SCj0ZNnLNdOqQxT box5SCj0ZNnLNdOqQxT) {
        if (box5SCj0ZNnLNdOqQxT != null) {
            if (box5SCj0ZNnLNdOqQxT.b1EoSIRjJHO5 != null) {
                throw new IllegalArgumentException(str.concat(".body != null").toString());
            }
            if (box5SCj0ZNnLNdOqQxT.pyu8ovAipBTLYAiKab != null) {
                throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
            }
            if (box5SCj0ZNnLNdOqQxT.D5P1xCAyuvgF != null) {
                throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
            }
            if (box5SCj0ZNnLNdOqQxT.hjneShqpF9Tis4 != null) {
                throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
            }
        }
    }

    public final Box5SCj0ZNnLNdOqQxT dDIMxZXP1V8HdM() {
        int i = this.vekpFI4d1Nc4fakF;
        if (i < 0) {
            throw new IllegalStateException(("code < 0: " + this.vekpFI4d1Nc4fakF).toString());
        }
        iniVyKd0OGb2raI4 inivykd0ogb2rai4 = this.dDIMxZXP1V8HdM;
        if (inivykd0ogb2rai4 == null) {
            throw new IllegalStateException("request == null");
        }
        B62d1BWQ36VxGmXU b62d1BWQ36VxGmXU = this.w9sT1Swbhx3hs;
        if (b62d1BWQ36VxGmXU == null) {
            throw new IllegalStateException("protocol == null");
        }
        String str = this.JXn4Qf7zpnLjP5;
        if (str != null) {
            return new Box5SCj0ZNnLNdOqQxT(inivykd0ogb2rai4, b62d1BWQ36VxGmXU, str, i, this.Ee8d2j4S9Vm5yGuR, this.xDyLpEZyrcKVe0.ibVTtJUNfrGYbW(), this.ibVTtJUNfrGYbW, this.b1EoSIRjJHO5, this.pyu8ovAipBTLYAiKab, this.D5P1xCAyuvgF, this.hjneShqpF9Tis4, this.gmNWMfvn6zlEj, this.gIIiyi2ddlMDR0);
        }
        throw new IllegalStateException("message == null");
    }
}
