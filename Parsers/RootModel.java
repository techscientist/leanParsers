import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String location_name;
	public int id;
	public String name;
	public String organizer_name;
	public String code_of_conduct;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String logo;
	public String description;
	public String email;
	public String organizer_description;
	public String start_time;
	public String end_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public String privacy;
	public String background_image;
	public String schedule_published_on;
	public String topic;

	public RootModel(CopyrightModel copyright, Call_for_papersModel call_for_papers, String type, String location_name, int id, String name, String organizer_name, String code_of_conduct, String timezone, ArrayList<Social_linksModel> social_links, String state, String logo, String description, String email, String organizer_description, String start_time, String end_time, CreatorModel creator, VersionModel version, String privacy, String background_image, String schedule_published_on, String topic) {

		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.name = name;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.social_links = social_links;
		this.state = state;
		this.logo = logo;
		this.description = description;
		this.email = email;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.end_time = end_time;
		this._creator = creator;
		this._version = version;
		this.privacy = privacy;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;

	}

}