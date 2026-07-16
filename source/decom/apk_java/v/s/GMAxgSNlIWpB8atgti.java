package v.s;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class GMAxgSNlIWpB8atgti extends LGm23hksIOxB implements NhN5GSKLYh6STld4 {
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GMAxgSNlIWpB8atgti(int i, Object obj) {
        super(2);
        this.vekpFI4d1Nc4fakF = i;
        this.JXn4Qf7zpnLjP5 = obj;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[LOOP:0: B:26:0x0070->B:37:0x00a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00e5 A[LOOP:2: B:43:0x00ad->B:54:0x00e5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:64:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e9 A[SYNTHETIC] */
    @Override // v.s.NhN5GSKLYh6STld4
    public final Object b1EoSIRjJHO5(Object obj, Object obj2) {
        Object next;
        String str;
        yI1KTRoNlsjx yi1ktronlsjx;
        String str2;
        Object next2;
        String str3;
        String str4;
        switch (this.vekpFI4d1Nc4fakF) {
            case 0:
                int iYrf7mWjzxCbCCUcSPwXl = KgSM0TsKUpCiuePB.Yrf7mWjzxCbCCUcSPwXl((CharSequence) obj, (char[]) this.JXn4Qf7zpnLjP5, ((Number) obj2).intValue(), false);
                if (iYrf7mWjzxCbCCUcSPwXl < 0) {
                    return null;
                }
                return new yI1KTRoNlsjx(Integer.valueOf(iYrf7mWjzxCbCCUcSPwXl), 1);
            default:
                CharSequence charSequence = (CharSequence) obj;
                int iIntValue = ((Number) obj2).intValue();
                List list = (List) this.JXn4Qf7zpnLjP5;
                if (list.size() == 1) {
                    int size = list.size();
                    if (size == 0) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    if (size != 1) {
                        throw new IllegalArgumentException("List has more than one element.");
                    }
                    String str5 = (String) list.get(0);
                    int iBbLLF31we2Iu = KgSM0TsKUpCiuePB.bbLLF31we2Iu(charSequence, str5, iIntValue, false, 4);
                    if (iBbLLF31we2Iu < 0) {
                        yi1ktronlsjx = null;
                    } else {
                        yi1ktronlsjx = new yI1KTRoNlsjx(Integer.valueOf(iBbLLF31we2Iu), str5);
                    }
                } else {
                    if (iIntValue < 0) {
                        iIntValue = 0;
                    }
                    VUjeMiNYIJhgmVJopga vUjeMiNYIJhgmVJopga = new VUjeMiNYIJhgmVJopga(iIntValue, charSequence.length(), 1);
                    boolean z = charSequence instanceof String;
                    int i = vUjeMiNYIJhgmVJopga.JXn4Qf7zpnLjP5;
                    int i2 = vUjeMiNYIJhgmVJopga.vekpFI4d1Nc4fakF;
                    if (z) {
                        if ((i <= 0 || iIntValue > i2) && (i >= 0 || i2 > iIntValue)) {
                            yi1ktronlsjx = null;
                        } else {
                            while (true) {
                                Iterator it = list.iterator();
                                do {
                                    if (it.hasNext()) {
                                        next2 = it.next();
                                        str4 = (String) next2;
                                    } else {
                                        next2 = null;
                                    }
                                    str3 = (String) next2;
                                    if (str3 != null) {
                                        yi1ktronlsjx = new yI1KTRoNlsjx(Integer.valueOf(iIntValue), str3);
                                    } else if (iIntValue != i2) {
                                        iIntValue += i;
                                    } else {
                                        yi1ktronlsjx = null;
                                    }
                                } while (!str4.regionMatches(0, (String) charSequence, iIntValue, str4.length()));
                                str3 = (String) next2;
                                if (str3 != null) {
                                    yi1ktronlsjx = new yI1KTRoNlsjx(Integer.valueOf(iIntValue), str3);
                                } else if (iIntValue != i2) {
                                    iIntValue += i;
                                } else {
                                    yi1ktronlsjx = null;
                                }
                            }
                        }
                    } else if ((i <= 0 || iIntValue > i2) && (i >= 0 || i2 > iIntValue)) {
                        yi1ktronlsjx = null;
                    } else {
                        int i3 = iIntValue;
                        while (true) {
                            Iterator it2 = list.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    str2 = (String) next;
                                } else {
                                    next = null;
                                }
                                str = (String) next;
                                if (str != null) {
                                    yi1ktronlsjx = new yI1KTRoNlsjx(Integer.valueOf(i3), str);
                                } else if (i3 != i2) {
                                    i3 += i;
                                } else {
                                    yi1ktronlsjx = null;
                                }
                            } while (!KgSM0TsKUpCiuePB.uCN4HERvZEfG7JjL(str2, 0, charSequence, i3, str2.length(), false));
                            str = (String) next;
                            if (str != null) {
                                yi1ktronlsjx = new yI1KTRoNlsjx(Integer.valueOf(i3), str);
                            } else if (i3 != i2) {
                                i3 += i;
                            } else {
                                yi1ktronlsjx = null;
                            }
                        }
                    }
                }
                if (yi1ktronlsjx != null) {
                    return new yI1KTRoNlsjx(yi1ktronlsjx.w9sT1Swbhx3hs, Integer.valueOf(((String) yi1ktronlsjx.vekpFI4d1Nc4fakF).length()));
                }
                return null;
        }
    }
}
