.class public Ldk/a$a;
.super Lci/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ldk/a;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ldk/a;


# direct methods
.method public constructor <init>(Ldk/a;)V
    .locals 0

    iput-object p1, p0, Ldk/a$a;->a:Ldk/a;

    invoke-direct {p0}, Lci/i;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lci/j;)V
    .locals 1

    iget-object v0, p0, Ldk/a$a;->a:Ldk/a;

    invoke-static {v0}, Ldk/a;->a(Ldk/a;)Lci/m;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ldk/a$a;->a:Ldk/a;

    invoke-static {v0}, Ldk/a;->a(Ldk/a;)Lci/m;

    move-result-object v0

    invoke-interface {v0, p1}, Lci/m;->a(Lci/j;)V

    :cond_0
    return-void
.end method
