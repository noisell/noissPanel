package v.s;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.util.Log;
import app.mobilex.plus.HandlerSJAdapter;
import app.mobilex.plus.services.ManagerUMController;
import app.mobilex.plus.util.TypefaceCache;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final /* synthetic */ class rA0nQJPukyMi implements As2k35rSTTZ3RAUS, EedOwBpLU616tq0s0D, A1BaTVAMeIXMnh, z3H4CF5ES1APfy6l, hYMmDgRUK0a6MaJzT, TbaRGxkAafT5 {
    public final /* synthetic */ Object vekpFI4d1Nc4fakF;
    public final /* synthetic */ int w9sT1Swbhx3hs;

    public /* synthetic */ rA0nQJPukyMi(int i, Object obj) {
        this.w9sT1Swbhx3hs = i;
        this.vekpFI4d1Nc4fakF = obj;
    }

    private static /* synthetic */ void ajgnv() {
    }

    @Override // v.s.EedOwBpLU616tq0s0D
    public void Ee8d2j4S9Vm5yGuR(Object obj) {
        boolean z;
        g3SNBiUFGCDVZ1c g3snbiufgcdvz1c = (g3SNBiUFGCDVZ1c) obj;
        if (!((FirebaseMessaging) this.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR.w9sT1Swbhx3hs() || g3snbiufgcdvz1c.b1EoSIRjJHO5.dDIMxZXP1V8HdM() == null) {
            return;
        }
        synchronized (g3snbiufgcdvz1c) {
            z = g3snbiufgcdvz1c.ibVTtJUNfrGYbW;
        }
        if (z) {
            return;
        }
        g3snbiufgcdvz1c.xDyLpEZyrcKVe0(0L);
    }

    @Override // v.s.z3H4CF5ES1APfy6l
    public Object JXn4Qf7zpnLjP5() {
        int i = this.w9sT1Swbhx3hs;
        int i2 = (-37) + 38;
        Object obj = this.vekpFI4d1Nc4fakF;
        switch (i) {
            case 5:
                c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx = (c0GsmbUiugE231HPbX) ((rR47ZPwFk6l5cadn8) obj);
                c0gsmbuiuge231hpbx.getClass();
                int i3 = gWzBsjX17jYks.Ee8d2j4S9Vm5yGuR;
                mYrXZiFjFW2Xg myrxzifjfw2xg = new mYrXZiFjFW2Xg();
                myrxzifjfw2xg.vekpFI4d1Nc4fakF = null;
                myrxzifjfw2xg.JXn4Qf7zpnLjP5 = new ArrayList();
                myrxzifjfw2xg.Ee8d2j4S9Vm5yGuR = null;
                myrxzifjfw2xg.w9sT1Swbhx3hs = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM = c0gsmbuiuge231hpbx.dDIMxZXP1V8HdM();
                sQLiteDatabaseDDIMxZXP1V8HdM.beginTransaction();
                try {
                    gWzBsjX17jYks gwzbsjx17jyks = (gWzBsjX17jYks) c0GsmbUiugE231HPbX.vIJudZvPyTuNp(sQLiteDatabaseDDIMxZXP1V8HdM.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new q5BX8lVsyHlpw(c0gsmbuiuge231hpbx, map, myrxzifjfw2xg, 4));
                    sQLiteDatabaseDDIMxZXP1V8HdM.setTransactionSuccessful();
                    return gwzbsjx17jyks;
                } finally {
                    sQLiteDatabaseDDIMxZXP1V8HdM.endTransaction();
                }
            case 6:
                c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx2 = (c0GsmbUiugE231HPbX) ((qAHCZrfOx8WOS) obj);
                long jJXn4Qf7zpnLjP5 = c0gsmbuiuge231hpbx2.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5() - c0gsmbuiuge231hpbx2.Ee8d2j4S9Vm5yGuR.JXn4Qf7zpnLjP5;
                SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM2 = c0gsmbuiuge231hpbx2.dDIMxZXP1V8HdM();
                sQLiteDatabaseDDIMxZXP1V8HdM2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jJXn4Qf7zpnLjP5)};
                    Cursor cursorRawQuery = sQLiteDatabaseDDIMxZXP1V8HdM2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            c0gsmbuiuge231hpbx2.Qrz92kRPw4GcghAc(cursorRawQuery.getInt(0), gBBpLea0L3FRWXAzN.MESSAGE_TOO_OLD, cursorRawQuery.getString(i2));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseDDIMxZXP1V8HdM2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseDDIMxZXP1V8HdM2.setTransactionSuccessful();
                    sQLiteDatabaseDDIMxZXP1V8HdM2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseDDIMxZXP1V8HdM2.endTransaction();
                    throw th2;
                }
            case 7:
                c0GsmbUiugE231HPbX c0gsmbuiuge231hpbx3 = (c0GsmbUiugE231HPbX) ((LutdQZ2I9fVx) obj).pyu8ovAipBTLYAiKab;
                SQLiteDatabase sQLiteDatabaseDDIMxZXP1V8HdM3 = c0gsmbuiuge231hpbx3.dDIMxZXP1V8HdM();
                sQLiteDatabaseDDIMxZXP1V8HdM3.beginTransaction();
                try {
                    sQLiteDatabaseDDIMxZXP1V8HdM3.compileStatement("DELETE FROM log_event_dropped").execute();
                    sQLiteDatabaseDDIMxZXP1V8HdM3.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c0gsmbuiuge231hpbx3.vekpFI4d1Nc4fakF.JXn4Qf7zpnLjP5()).execute();
                    sQLiteDatabaseDDIMxZXP1V8HdM3.setTransactionSuccessful();
                    return null;
                } finally {
                    sQLiteDatabaseDDIMxZXP1V8HdM3.endTransaction();
                }
            default:
                fUH025aw0Rgl fuh025aw0rgl = (fUH025aw0Rgl) obj;
                Iterator it = ((Iterable) ((c0GsmbUiugE231HPbX) ((qAHCZrfOx8WOS) fuh025aw0rgl.w9sT1Swbhx3hs)).D5P1xCAyuvgF(new UeVBYgBvSKYfVuXLhMs(32 - 15))).iterator();
                while (it.hasNext()) {
                    ((eTeIZwLyooQrZ0ICI9i) fuh025aw0rgl.vekpFI4d1Nc4fakF).Ee8d2j4S9Vm5yGuR((oO26y14q3Pwf) it.next(), i2, false);
                }
                return null;
        }
    }

    @Override // v.s.A1BaTVAMeIXMnh
    public void dDIMxZXP1V8HdM(Object obj) {
        Intent intentH9XlUr4OeMJFiXK;
        HandlerSJAdapter handlerSJAdapter = (HandlerSJAdapter) this.vekpFI4d1Nc4fakF;
        k84rwRrqzhrNQ1CdNQ9 k84rwrrqzhrnq1cdnq9 = (k84rwRrqzhrNQ1CdNQ9) obj;
        HandlerSJAdapter.rCHnHJBAlOpNI5 = false;
        if (k84rwrrqzhrnq1cdnq9.w9sT1Swbhx3hs != -1 || k84rwrrqzhrnq1cdnq9.vekpFI4d1Nc4fakF == null) {
            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7003300730049008A00F900AC00C100AE002C0078001B008300F500B100DB00A20027");
        } else {
            TypefaceCache.obtain("000E0073005F008E00F1008F00C000A8002900730058009300F900B000DC00E7003300730049008A00F900AC00C100AE002C0078001B008000E200BE00DC00B300260072001700C700F800A900DC00A4007E");
            if (Build.VERSION.SDK_INT < 34) {
                HandlerSJAdapter.O2DHNSIGZlgPja7eqLgn = Integer.valueOf(k84rwrrqzhrnq1cdnq9.w9sT1Swbhx3hs);
                HandlerSJAdapter.xfn2GJwmGqs7kWW = k84rwrrqzhrnq1cdnq9.vekpFI4d1Nc4fakF;
            }
            if (handlerSJAdapter.DVTNwpDEVsUKuznof) {
                String str = ManagerUMController.DVTNwpDEVsUKuznof;
                intentH9XlUr4OeMJFiXK = SbxdZ6Kq2uhHQ5RPRqm.MLSIo1htfMPWeB8V876L(handlerSJAdapter, k84rwrrqzhrnq1cdnq9.w9sT1Swbhx3hs, k84rwrrqzhrnq1cdnq9.vekpFI4d1Nc4fakF, handlerSJAdapter.l1V0lQr6TbwNKqHfXNbb);
            } else {
                String str2 = ManagerUMController.DVTNwpDEVsUKuznof;
                intentH9XlUr4OeMJFiXK = SbxdZ6Kq2uhHQ5RPRqm.H9XlUr4OeMJFiXK(handlerSJAdapter, k84rwrrqzhrnq1cdnq9.w9sT1Swbhx3hs, k84rwrrqzhrnq1cdnq9.vekpFI4d1Nc4fakF, handlerSJAdapter.H9XlUr4OeMJFiXK);
            }
            handlerSJAdapter.startForegroundService(intentH9XlUr4OeMJFiXK);
        }
        handlerSJAdapter.finish();
    }

    public Or5PM5MwQB0KzFUgjHR9 ibVTtJUNfrGYbW(eTeIZwLyooQrZ0ICI9i eteizwlyooqrz0ici9i) throws IOException {
        V20IGCy8JC99pmhwML v20IGCy8JC99pmhwML = (V20IGCy8JC99pmhwML) this.vekpFI4d1Nc4fakF;
        URL url = (URL) eteizwlyooqrz0ici9i.w9sT1Swbhx3hs;
        if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
            String.format("Making request to: %s", url);
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(v20IGCy8JC99pmhwML.ibVTtJUNfrGYbW);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.8 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) eteizwlyooqrz0ici9i.JXn4Qf7zpnLjP5;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    r5XEUfod5GSCCwq6c r5xeufod5gsccwq6c = v20IGCy8JC99pmhwML.dDIMxZXP1V8HdM;
                    AA5DbR8pp2wjO06aN aA5DbR8pp2wjO06aN = (AA5DbR8pp2wjO06aN) eteizwlyooqrz0ici9i.vekpFI4d1Nc4fakF;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    JEAVCzceAY7qFyOT jEAVCzceAY7qFyOT = (JEAVCzceAY7qFyOT) r5xeufod5gsccwq6c.vekpFI4d1Nc4fakF;
                    lll4zYzNgPu62V lll4zyzngpu62v = new lll4zYzNgPu62V(bufferedWriter, jEAVCzceAY7qFyOT.dDIMxZXP1V8HdM, jEAVCzceAY7qFyOT.w9sT1Swbhx3hs, jEAVCzceAY7qFyOT.vekpFI4d1Nc4fakF, jEAVCzceAY7qFyOT.JXn4Qf7zpnLjP5);
                    lll4zyzngpu62v.xDyLpEZyrcKVe0(aA5DbR8pp2wjO06aN);
                    lll4zyzngpu62v.b1EoSIRjJHO5();
                    lll4zyzngpu62v.w9sT1Swbhx3hs.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer numValueOf = Integer.valueOf(responseCode);
                    if (Log.isLoggable("TRuntime.".concat("CctTransportBackend"), 4)) {
                        String.format("Status Code: %d", numValueOf);
                    }
                    jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    jb8et6SZeK5TWMrJFxDX.Ee8d2j4S9Vm5yGuR("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new Or5PM5MwQB0KzFUgjHR9(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new Or5PM5MwQB0KzFUgjHR9(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            Or5PM5MwQB0KzFUgjHR9 or5PM5MwQB0KzFUgjHR9 = new Or5PM5MwQB0KzFUgjHR9(responseCode, null, hPXhNf9INdrxF.dDIMxZXP1V8HdM(new BufferedReader(new InputStreamReader(gZIPInputStream))).dDIMxZXP1V8HdM);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return or5PM5MwQB0KzFUgjHR9;
                        } catch (Throwable th) {
                            if (gZIPInputStream == null) {
                                throw th;
                            }
                            try {
                                gZIPInputStream.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        if (inputStream == null) {
                            throw th3;
                        }
                        try {
                            inputStream.close();
                            throw th3;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                            throw th3;
                        }
                    }
                } catch (Throwable th5) {
                    try {
                        gZIPOutputStream.close();
                        throw th5;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                        throw th5;
                    }
                }
            } catch (Throwable th7) {
                if (outputStream == null) {
                    throw th7;
                }
                try {
                    outputStream.close();
                    throw th7;
                } catch (Throwable th8) {
                    th7.addSuppressed(th8);
                    throw th7;
                }
            }
        } catch (ConnectException | UnknownHostException unused) {
            jb8et6SZeK5TWMrJFxDX.hjneShqpF9Tis4("CctTransportBackend");
            return new Or5PM5MwQB0KzFUgjHR9(500, null, 0L);
        } catch (IOException | O4K5KpahtuR0 unused2) {
            jb8et6SZeK5TWMrJFxDX.hjneShqpF9Tis4("CctTransportBackend");
            return new Or5PM5MwQB0KzFUgjHR9(400, null, 0L);
        }
    }

    @Override // v.s.TbaRGxkAafT5
    public z4xRvJ1RJf5JDR vekpFI4d1Nc4fakF(b4HNTST9eKD8OwjVF8x b4hntst9ekd8owjvf8x) {
        Context context = (Context) this.vekpFI4d1Nc4fakF;
        String str = b4hntst9ekd8owjvf8x.w9sT1Swbhx3hs;
        sfr0Aaw8vBbkmexjHdWK sfr0aaw8vbbkmexjhdwk = b4hntst9ekd8owjvf8x.vekpFI4d1Nc4fakF;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        return new wIulk4QxNLn4s(context, str, sfr0aaw8vbbkmexjhdwk, true, true);
    }

    @Override // v.s.As2k35rSTTZ3RAUS
    public Object w9sT1Swbhx3hs(iniVyKd0OGb2raI4 inivykd0ogb2rai4) {
        switch (this.w9sT1Swbhx3hs) {
            case 1:
                return this.vekpFI4d1Nc4fakF;
            default:
                return new TT2KHOpLgEiQtjhkGm((Context) inivykd0ogb2rai4.dDIMxZXP1V8HdM(Context.class), ((dfwkxUDiclPw1BowH4) inivykd0ogb2rai4.dDIMxZXP1V8HdM(dfwkxUDiclPw1BowH4.class)).vekpFI4d1Nc4fakF(), inivykd0ogb2rai4.w9sT1Swbhx3hs(QwPxr2jx1iGLmehgkv3g.dDIMxZXP1V8HdM(W6dfON4KdcdxlH.class)), inivykd0ogb2rai4.JXn4Qf7zpnLjP5(JIlQIGti1DoC.class), (Executor) inivykd0ogb2rai4.vekpFI4d1Nc4fakF((QwPxr2jx1iGLmehgkv3g) this.vekpFI4d1Nc4fakF));
        }
    }

    @Override // v.s.hYMmDgRUK0a6MaJzT
    public void xDyLpEZyrcKVe0(DfUmSWZwfhCUz dfUmSWZwfhCUz) {
        switch (this.w9sT1Swbhx3hs) {
            case 8:
                vM8ZJw883KaO.w9sT1Swbhx3hs((Intent) this.vekpFI4d1Nc4fakF);
                break;
            case 9:
                ((gORGwV1UC2rtv3txmCK) this.vekpFI4d1Nc4fakF).w9sT1Swbhx3hs.vekpFI4d1Nc4fakF(null);
                break;
            default:
                ((ScheduledFuture) this.vekpFI4d1Nc4fakF).cancel(false);
                break;
        }
    }
}
