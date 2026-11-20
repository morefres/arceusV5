.class public final synthetic Lsu/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lsu/l;

.field public final synthetic b:Lsu/b;


# direct methods
.method public synthetic constructor <init>(Lsu/l;Lsu/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsu/a;->a:Lsu/l;

    iput-object p2, p0, Lsu/a;->b:Lsu/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lsu/a;->a:Lsu/l;

    iget-object v1, p0, Lsu/a;->b:Lsu/b;

    invoke-static {v0, v1}, Lsu/b;->a(Lsu/l;Lsu/b;)V

    return-void
.end method
