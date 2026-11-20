.class public final synthetic Lmj/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmi/f$a;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;JJLjava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj/l;->a:Landroid/content/Context;

    iput-wide p2, p0, Lmj/l;->b:J

    iput-wide p4, p0, Lmj/l;->c:J

    iput-object p6, p0, Lmj/l;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Z)V
    .locals 8

    iget-object v0, p0, Lmj/l;->a:Landroid/content/Context;

    iget-wide v1, p0, Lmj/l;->b:J

    iget-wide v3, p0, Lmj/l;->c:J

    iget-object v5, p0, Lmj/l;->d:Ljava/lang/String;

    move-object v6, p1

    move v7, p2

    invoke-static/range {v0 .. v7}, Lcom/roblox/client/pushnotification/v2/SendrChatMessageReplyHandler;->l(Landroid/content/Context;JJLjava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method
