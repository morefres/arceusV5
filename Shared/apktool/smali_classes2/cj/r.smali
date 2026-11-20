.class public Lcj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcj/r$c;,
        Lcj/r$b;
    }
.end annotation


# instance fields
.field public a:Lci/f;

.field public b:Lti/g;


# direct methods
.method public constructor <init>(Lci/f;)V
    .locals 0
    .param p1    # Lci/f;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcj/r;->a:Lci/f;

    invoke-static {}, Lti/g;->b()Lti/g;

    move-result-object p1

    iput-object p1, p0, Lcj/r;->b:Lti/g;

    return-void
.end method

.method public static bridge synthetic a(Lcj/r;)Lti/g;
    .locals 0

    iget-object p0, p0, Lcj/r;->b:Lti/g;

    return-object p0
.end method


# virtual methods
.method public b(Ljava/lang/String;Lei/a;Lcj/r$c;)V
    .locals 2

    new-instance v0, Lcj/r$a;

    invoke-direct {v0, p0, p3}, Lcj/r$a;-><init>(Lcj/r;Lcj/r$c;)V

    iget-object p3, p0, Lcj/r;->a:Lci/f;

    const/4 v1, 0x0

    invoke-interface {p3, p1, p2, v1, v0}, Lci/f;->a(Ljava/lang/String;Lei/a;[Lci/c$a;Lci/l;)Lci/e;

    move-result-object p1

    invoke-virtual {p1}, Lci/a;->b()V

    iget-object p1, p0, Lcj/r;->b:Lti/g;

    invoke-virtual {p1}, Lti/g;->K()V

    return-void
.end method
