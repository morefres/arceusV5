.class public Lhi/g;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/g$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 2

    const-string v0, "Localization"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/g$a;

    invoke-direct {v0, p0}, Lhi/g$a;-><init>(Lhi/g;)V

    const-string v1, "languageChangeTrigger"

    invoke-virtual {p0, v1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method
