.class public Lhi/m;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/m$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "RealTime"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/m$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhi/m$a;-><init>(Lhi/m;Lhi/n;)V

    const-string v1, "isConnected"

    invoke-virtual {p0, v1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method
