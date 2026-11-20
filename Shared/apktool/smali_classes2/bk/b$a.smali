.class public Lbk/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbk/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbk/b;->b(Lbk/b$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lbk/b;


# direct methods
.method public constructor <init>(Lbk/b;)V
    .locals 0

    iput-object p1, p0, Lbk/b$a;->a:Lbk/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lml/a;->b(Ljava/lang/String;)Lml/a;

    move-result-object p1

    invoke-static {}, Ldk/c;->c()Ldk/c;

    move-result-object v0

    invoke-virtual {v0, p1}, Ldk/c;->u(Lml/a;)V

    iget-object v0, p0, Lbk/b$a;->a:Lbk/b;

    invoke-static {v0, p1}, Lbk/b;->a(Lbk/b;Lml/a;)V

    return-void
.end method
