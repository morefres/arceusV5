.class public final synthetic Leh/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Leh/f;

.field public final synthetic b:Leh/i$a;


# direct methods
.method public synthetic constructor <init>(Leh/f;Leh/i$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh/e;->a:Leh/f;

    iput-object p2, p0, Leh/e;->b:Leh/i$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Leh/e;->a:Leh/f;

    iget-object v1, p0, Leh/e;->b:Leh/i$a;

    invoke-static {v0, v1}, Leh/f;->c(Leh/f;Leh/i$a;)V

    return-void
.end method
