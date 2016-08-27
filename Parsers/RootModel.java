import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String type;
	public String logo;
	public String description;
	public String privacy;
	public String end_time;
	public String name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String topic;
	public String schedule_published_on;
	public String state;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String location_name;
	public String start_time;
	public String organizer_name;
	public int id;
	public String timezone;
	public String background_image;

	public RootModel(VersionModel version, String type, String logo, String description, String privacy, String end_time, String name, String organizer_description, Call_for_papersModel call_for_papers, String email, ArrayList<Social_linksModel> social_links, String code_of_conduct, String topic, String schedule_published_on, String state, CopyrightModel copyright, CreatorModel creator, String location_name, String start_time, String organizer_name, int id, String timezone, String background_image) {

		this._version = version;
		this.type = type;
		this.logo = logo;
		this.description = description;
		this.privacy = privacy;
		this.end_time = end_time;
		this.name = name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._copyright = copyright;
		this._creator = creator;
		this.location_name = location_name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.timezone = timezone;
		this.background_image = background_image;

	}

}