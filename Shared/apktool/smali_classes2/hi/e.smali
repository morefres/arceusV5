.class public Lhi/e;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/e$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Game"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/e$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhi/e$a;-><init>(Lhi/e;Lhi/f;)V

    const-string v1, "launchGame"

    invoke-virtual {p0, v1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method
