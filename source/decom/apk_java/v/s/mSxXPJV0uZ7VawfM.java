package v.s;

import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class mSxXPJV0uZ7VawfM implements Callable {
    public final /* synthetic */ int dDIMxZXP1V8HdM;
    public final /* synthetic */ TT2KHOpLgEiQtjhkGm w9sT1Swbhx3hs;

    public /* synthetic */ mSxXPJV0uZ7VawfM(TT2KHOpLgEiQtjhkGm tT2KHOpLgEiQtjhkGm, int i) {
        this.dDIMxZXP1V8HdM = i;
        this.w9sT1Swbhx3hs = tT2KHOpLgEiQtjhkGm;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String string;
        switch (this.dDIMxZXP1V8HdM) {
            case 0:
                TT2KHOpLgEiQtjhkGm tT2KHOpLgEiQtjhkGm = this.w9sT1Swbhx3hs;
                synchronized (tT2KHOpLgEiQtjhkGm) {
                    try {
                        XlNqgz8EVh2x11Ly xlNqgz8EVh2x11Ly = (XlNqgz8EVh2x11Ly) tT2KHOpLgEiQtjhkGm.dDIMxZXP1V8HdM.get();
                        ArrayList arrayListVekpFI4d1Nc4fakF = xlNqgz8EVh2x11Ly.vekpFI4d1Nc4fakF();
                        xlNqgz8EVh2x11Ly.w9sT1Swbhx3hs();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListVekpFI4d1Nc4fakF.size(); i++) {
                            Zv2dAO3G6ktqC zv2dAO3G6ktqC = (Zv2dAO3G6ktqC) arrayListVekpFI4d1Nc4fakF.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", zv2dAO3G6ktqC.dDIMxZXP1V8HdM);
                            jSONObject.put("dates", new JSONArray((Collection) zv2dAO3G6ktqC.w9sT1Swbhx3hs));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            default:
                TT2KHOpLgEiQtjhkGm tT2KHOpLgEiQtjhkGm2 = this.w9sT1Swbhx3hs;
                synchronized (tT2KHOpLgEiQtjhkGm2) {
                    ((XlNqgz8EVh2x11Ly) tT2KHOpLgEiQtjhkGm2.dDIMxZXP1V8HdM.get()).b1EoSIRjJHO5(System.currentTimeMillis(), ((JIlQIGti1DoC) tT2KHOpLgEiQtjhkGm2.vekpFI4d1Nc4fakF.get()).dDIMxZXP1V8HdM());
                    break;
                }
                return null;
        }
    }
}
