package v.s;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-15e63fcf80fafdb0de787d7190aafb45897c9495c974dfb43163f91afee6c091 */
/* JADX INFO: loaded from: /private/tmp/claude-501/-Users-noiss-Work-exploit-RedWing-Panel-main-source-internal-builder/68c7750b-b3a0-412f-ab12-bf16e4a764d8/scratchpad/dex_extract/classes.dex */
public final class tdVrJ0LVZVn68Eqj extends hY5LMKhGGQVxmKz6FME {
    public final Socket gIIiyi2ddlMDR0;

    public tdVrJ0LVZVn68Eqj(Socket socket) {
        this.gIIiyi2ddlMDR0 = socket;
    }

    public final IOException gmNWMfvn6zlEj(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // v.s.hY5LMKhGGQVxmKz6FME
    public final void hjneShqpF9Tis4() {
        Socket socket = this.gIIiyi2ddlMDR0;
        try {
            socket.close();
        } catch (AssertionError e) {
            Logger logger = tntAixqOgreLyNBUe.dDIMxZXP1V8HdM;
            boolean z = false;
            if (e.getCause() != null) {
                String message = e.getMessage();
                if (message != null ? KgSM0TsKUpCiuePB.VEkRsTDS6a9oHWI(message, "getsockname failed", false) : false) {
                    z = true;
                }
            }
            if (!z) {
                throw e;
            }
            tntAixqOgreLyNBUe.dDIMxZXP1V8HdM.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
        } catch (Exception e2) {
            tntAixqOgreLyNBUe.dDIMxZXP1V8HdM.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
        }
    }
}
