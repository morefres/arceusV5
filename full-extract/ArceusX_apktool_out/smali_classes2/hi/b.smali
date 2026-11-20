.class public Lhi/b;
.super Lrk/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lhi/b$b;,
        Lhi/b$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 3

    const-string v0, "Chat"

    invoke-direct {p0, v0}, Lrk/b;-><init>(Ljava/lang/String;)V

    new-instance v0, Lhi/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhi/b$b;-><init>(Lhi/b;Lhi/c;)V

    const-string v2, "startChatConversation"

    invoke-virtual {p0, v2, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    new-instance v0, Lhi/b$a;

    invoke-direct {v0, p0, v1}, Lhi/b$a;-><init>(Lhi/b;Lhi/c;)V

    const-string v1, "shareGameToChat"

    invoke-virtual {p0, v1, v0}, Lrk/b;->d(Ljava/lang/String;Lrk/b$a;)V

    return-void
.end method
