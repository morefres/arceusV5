.class public final synthetic Lth/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lth/g;

.field public final synthetic b:Le4/q;


# direct methods
.method public synthetic constructor <init>(Lth/g;Le4/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lth/f;->a:Lth/g;

    iput-object p2, p0, Lth/f;->b:Le4/q;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lth/f;->a:Lth/g;

    iget-object v1, p0, Lth/f;->b:Le4/q;

    invoke-static {v0, v1}, Lth/g;->K3(Lth/g;Le4/q;)V

    return-void
.end method
