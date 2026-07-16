package v.s;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public class XslKUngIJyofTLpQ5 implements Serializable, Comparable {
    public static final XslKUngIJyofTLpQ5 Ee8d2j4S9Vm5yGuR = new XslKUngIJyofTLpQ5(new byte[0]);
    public transient String JXn4Qf7zpnLjP5;
    public transient int vekpFI4d1Nc4fakF;
    public final byte[] w9sT1Swbhx3hs;

    public XslKUngIJyofTLpQ5(byte[] bArr) {
        this.w9sT1Swbhx3hs = bArr;
    }

    private static /* synthetic */ void tzbgtvne() {
    }

    public byte[] D5P1xCAyuvgF() {
        byte[] bArr = this.w9sT1Swbhx3hs;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public byte[] Ee8d2j4S9Vm5yGuR() {
        return this.w9sT1Swbhx3hs;
    }

    public String JXn4Qf7zpnLjP5() {
        byte[] bArr = this.w9sT1Swbhx3hs;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = OFMrQsTe5s1KYV0lq.dDIMxZXP1V8HdM;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public boolean b1EoSIRjJHO5(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.w9sT1Swbhx3hs;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = (XslKUngIJyofTLpQ5) obj;
        int iVekpFI4d1Nc4fakF = vekpFI4d1Nc4fakF();
        int iVekpFI4d1Nc4fakF2 = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
        int iMin = Math.min(iVekpFI4d1Nc4fakF, iVekpFI4d1Nc4fakF2);
        for (int i = 0; i < iMin; i++) {
            int iXDyLpEZyrcKVe0 = xDyLpEZyrcKVe0(i) & 255;
            int iXDyLpEZyrcKVe1 = xslKUngIJyofTLpQ5.xDyLpEZyrcKVe0(i) & 255;
            if (iXDyLpEZyrcKVe0 != iXDyLpEZyrcKVe1) {
                return iXDyLpEZyrcKVe0 < iXDyLpEZyrcKVe1 ? -1 : 1;
            }
        }
        if (iVekpFI4d1Nc4fakF == iVekpFI4d1Nc4fakF2) {
            return 0;
        }
        return iVekpFI4d1Nc4fakF < iVekpFI4d1Nc4fakF2 ? -1 : 1;
    }

    public String dDIMxZXP1V8HdM() {
        byte[] bArr = dDIMxZXP1V8HdM.dDIMxZXP1V8HdM;
        byte[] bArr2 = this.w9sT1Swbhx3hs;
        int i = 0 + 2;
        byte[] bArr3 = new byte[((bArr2.length + i) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = bArr2[i2];
            int i5 = i2 + 2;
            int i6 = bArr2[i2 + 1];
            i2 += 3;
            int i7 = bArr2[i5];
            bArr3[i3] = bArr[(i4 & 255) >> i];
            bArr3[i3 + 1] = bArr[((i4 & 3) << 4) | ((i6 & 255) >> 4)];
            int i8 = i3 + 3;
            bArr3[i3 + 2] = bArr[((i6 & 15) << i) | ((i7 & 255) >> 6)];
            i3 += 4;
            bArr3[i8] = bArr[i7 & 63];
        }
        int length2 = bArr2.length - length;
        if (length2 == 1) {
            byte b = bArr2[i2];
            bArr3[i3] = bArr[(b & 255) >> 2];
            bArr3[i3 + 1] = bArr[(b & 3) << 4];
            bArr3[i3 + 2] = 61;
            bArr3[i3 + 3] = 61;
        } else if (length2 == i) {
            int i9 = i2 + 1;
            int i10 = bArr2[i2];
            int i11 = bArr2[i9];
            bArr3[i3] = bArr[(i10 & 255) >> i];
            bArr3[i3 + 1] = bArr[((i10 & 3) << 4) | ((i11 & 255) >> 4)];
            bArr3[i3 + 2] = bArr[(i11 & 15) << i];
            bArr3[i3 + 3] = 61;
        }
        return new String(bArr3, N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof XslKUngIJyofTLpQ5) {
            XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5 = (XslKUngIJyofTLpQ5) obj;
            int iVekpFI4d1Nc4fakF = xslKUngIJyofTLpQ5.vekpFI4d1Nc4fakF();
            byte[] bArr = this.w9sT1Swbhx3hs;
            if (iVekpFI4d1Nc4fakF == bArr.length && xslKUngIJyofTLpQ5.b1EoSIRjJHO5(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public void gmNWMfvn6zlEj(LTdvNeHFqTsIb9 lTdvNeHFqTsIb9, int i) {
        lTdvNeHFqTsIb9.tne6mXOUFKdd(this.w9sT1Swbhx3hs, i);
    }

    public int hashCode() {
        int i = this.vekpFI4d1Nc4fakF;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.w9sT1Swbhx3hs);
        this.vekpFI4d1Nc4fakF = iHashCode;
        return iHashCode;
    }

    public final String hjneShqpF9Tis4() {
        String str = this.JXn4Qf7zpnLjP5;
        if (str != null) {
            return str;
        }
        String str2 = new String(Ee8d2j4S9Vm5yGuR(), N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM);
        this.JXn4Qf7zpnLjP5 = str2;
        return str2;
    }

    public boolean ibVTtJUNfrGYbW(int i, XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5) {
        return xslKUngIJyofTLpQ5.b1EoSIRjJHO5(0, this.w9sT1Swbhx3hs, 0, i);
    }

    public XslKUngIJyofTLpQ5 pyu8ovAipBTLYAiKab() {
        int i;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.w9sT1Swbhx3hs;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b = bArr[i2];
            if (b >= 65 && b <= (i = 178 - 88)) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                bArrCopyOf[i2] = (byte) (b + 32);
                for (int i3 = i2 + 1; i3 < bArrCopyOf.length; i3++) {
                    byte b2 = bArrCopyOf[i3];
                    if (b2 >= 65 && b2 <= i) {
                        bArrCopyOf[i3] = (byte) (b2 + 32);
                    }
                }
                return new XslKUngIJyofTLpQ5(bArrCopyOf);
            }
            i2++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:179:0x01f2 A[EDGE_INSN: B:179:0x01f2->B:180:0x01f3 BREAK  A[LOOP:0: B:7:0x0012->B:241:0x0012]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [char, int] */
    public String toString() {
        XslKUngIJyofTLpQ5 xslKUngIJyofTLpQ5;
        byte b;
        int i;
        byte[] bArr = this.w9sT1Swbhx3hs;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        loop0: while (i2 < length) {
            byte b2 = bArr[i2];
            if (b2 < 0) {
                int i5 = (-79) + 77;
                if ((b2 >> 5) != i5) {
                    if ((b2 >> 4) != i5) {
                        if ((b2 >> 3) != i5) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i6 = i2 + 3;
                        if (length > i6) {
                            byte b3 = bArr[i2 + 1];
                            if ((b3 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b4 = bArr[i2 + 2];
                            if ((b4 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b5 = bArr[i6];
                            if ((b5 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i7 = (((b5 ^ 3678080) ^ (b4 << 6)) ^ (b3 << 12)) ^ (b2 << 18);
                            if (i7 <= 1114111) {
                                if (55296 <= i7 && i7 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                if (i7 >= 65536) {
                                    i = i4 + 1;
                                    if (i4 == 64) {
                                        break;
                                    }
                                    if ((i7 != 10 && i7 != 13 && ((i7 >= 0 && i7 < 32) || (176 - 49 <= i7 && i7 < 160))) || i7 == 65533) {
                                        i3 = -1;
                                        break;
                                    }
                                    i3 += i7 < 65536 ? 1 : 2;
                                    i2 += 4;
                                    i4 = i;
                                } else {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        int i8 = i2 + 2;
                        if (length > i8) {
                            byte b6 = bArr[i2 + 1];
                            if ((b6 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            byte b7 = bArr[i8];
                            if ((b7 & 192) != 128) {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                            int i9 = ((b7 ^ (-123008)) ^ (b6 << 6)) ^ (b2 << 12);
                            if (i9 >= 2048) {
                                if (55296 <= i9 && i9 < 57344) {
                                    if (i4 == 64) {
                                        break;
                                    }
                                    i3 = -1;
                                    break;
                                }
                                i = i4 + 1;
                                if (i4 == 64) {
                                    break;
                                }
                                if ((i9 != 10 && i9 != 13 && ((i9 >= 0 && i9 < 126 - 94) || (127 <= i9 && i9 < 160))) || i9 == 65533) {
                                    i3 = -1;
                                    break;
                                }
                                i3 += i9 < 65536 ? 1 : 2;
                                i2 += 3;
                                i4 = i;
                            } else {
                                if (i4 == 64) {
                                    break;
                                }
                                i3 = -1;
                                break;
                            }
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    }
                } else {
                    int i10 = i2 + 1;
                    if (length > i10) {
                        byte b8 = bArr[i10];
                        if ((b8 & 192) != 128) {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                        int i11 = (b8 ^ 3968) ^ (b2 << 6);
                        if (i11 >= 128) {
                            i = i4 + 1;
                            if (i4 == 64) {
                                break;
                            }
                            if ((i11 != 10 && i11 != 13 && ((i11 >= 0 && i11 < 32) || (127 <= i11 && i11 < 160))) || i11 == 65533) {
                                i3 = -1;
                                break;
                            }
                            i3 += i11 < 65536 ? 1 : 2;
                            i2 += 2;
                            i4 = i;
                        } else {
                            if (i4 == 64) {
                                break;
                            }
                            i3 = -1;
                            break;
                        }
                    } else {
                        if (i4 == 64) {
                            break;
                        }
                        i3 = -1;
                        break;
                    }
                }
            } else {
                int i12 = i4 + 1;
                if (i4 == 64) {
                    break;
                }
                if ((b2 == 10 || b2 == 13 || ((b2 < 0 || b2 >= 32) && (127 > b2 || b2 >= 160))) && b2 != 65533) {
                    i3 += b2 < 65536 ? 1 : 2;
                    i2++;
                    while (true) {
                        i4 = i12;
                        if (i2 < length && (b = bArr[i2]) >= 0) {
                            i2++;
                            i12 = i4 + 1;
                            if (i4 == 64) {
                                break loop0;
                            }
                            if ((b == 10 || b == 13 || ((b < 0 || b >= 32) && (127 > b || b >= 160))) && b != 65533) {
                                i3 += b < 65536 ? 1 : 2;
                            }
                        }
                    }
                }
                i3 = -1;
                break;
            }
        }
        if (i3 != -1) {
            String strHjneShqpF9Tis4 = hjneShqpF9Tis4();
            String strMSGkxvPxRYNqC = BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(BS2kx9eAoOyDiNGAFlFk.MSGkxvPxRYNqC(strHjneShqpF9Tis4.substring(0, i3), "\\", "\\\\"), "\n", "\\n"), "\r", "\\r");
            if (i3 >= strHjneShqpF9Tis4.length()) {
                return "[text=" + strMSGkxvPxRYNqC + ']';
            }
            return "[size=" + bArr.length + " text=" + strMSGkxvPxRYNqC + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + JXn4Qf7zpnLjP5() + ']';
        }
        StringBuilder sb = new StringBuilder("[size=");
        sb.append(bArr.length);
        sb.append(" hex=");
        if (64 > bArr.length) {
            throw new IllegalArgumentException(("endIndex > length(" + bArr.length + ((char) (29 + 12))).toString());
        }
        if (64 == bArr.length) {
            xslKUngIJyofTLpQ5 = this;
        } else {
            SbxdZ6Kq2uhHQ5RPRqm.hjneShqpF9Tis4(64, bArr.length);
            xslKUngIJyofTLpQ5 = new XslKUngIJyofTLpQ5(Arrays.copyOfRange(bArr, 0, 64));
        }
        sb.append(xslKUngIJyofTLpQ5.JXn4Qf7zpnLjP5());
        sb.append("…]");
        return sb.toString();
    }

    public int vekpFI4d1Nc4fakF() {
        return this.w9sT1Swbhx3hs.length;
    }

    public XslKUngIJyofTLpQ5 w9sT1Swbhx3hs(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.w9sT1Swbhx3hs, 0, vekpFI4d1Nc4fakF());
        return new XslKUngIJyofTLpQ5(messageDigest.digest());
    }

    public byte xDyLpEZyrcKVe0(int i) {
        return this.w9sT1Swbhx3hs[i];
    }
}
