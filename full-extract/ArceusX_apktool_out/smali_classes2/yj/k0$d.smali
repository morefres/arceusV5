.class public Lyj/k0$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lti/h$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lyj/k0;->H(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lyj/k0;


# direct methods
.method public constructor <init>(Lyj/k0;)V
    .locals 0

    iput-object p1, p0, Lyj/k0$d;->a:Lyj/k0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "InitHelper"

    const-string v1, "onDidLoginEventFromLua: ... onPostLoginCompleted."

    invoke-static {v0, v1}, Lek/q;->h(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Lyj/k0$d;->a:Lyj/k0;

    invoke-static {v0}, Lyj/k0;->j(Lyj/k0;)Lyj/n0;

    move-result-object v0

    invoke-interface {v0}, Lyj/n0;->k0()V

    iget-object v0, p0, Lyj/k0$d;->a:Lyj/k0;

    invoke-static {v0}, Lyj/k0;->h(Lyj/k0;)V

    return-void
.end method
