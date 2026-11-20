.class public Lhi/j;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/j$a;,
        Lhi/j$b;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Overlay"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/j$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhi/j$a;-><init>(Lhi/j;Lhi/k;)V

    const-string v2, "close"

    invoke-virtual {p0, v2, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    new-instance v0, Lhi/j$b;

    invoke-direct {v0, p0, v1}, Lhi/j$b;-><init>(Lhi/j;Lhi/k;)V

    const-string v1, "setSubmitState"

    invoke-virtual {p0, v1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method
