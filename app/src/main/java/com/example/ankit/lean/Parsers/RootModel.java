import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public CopyrightModel _copyright;
	public String topic;
	public String description;
	public String timezone;
	public String logo;
	public CreatorModel _creator;
	public String start_time;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String schedule_published_on;
	public String name;
	public String end_time;
	public String email;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String organizer_description;
	public String type;
	public int id;
	public String organizer_name;
	public String background_image;

	public RootModel(VersionModel version, CopyrightModel copyright, String topic, String description, String timezone, String logo, CreatorModel creator, String start_time, String privacy, Call_for_papersModel call_for_papers, String location_name, String schedule_published_on, String name, String end_time, String email, String code_of_conduct, ArrayList<Social_linksModel> social_links, String state, String organizer_description, String type, int id, String organizer_name, String background_image) {

		this._version = version;
		this._copyright = copyright;
		this.topic = topic;
		this.description = description;
		this.timezone = timezone;
		this.logo = logo;
		this._creator = creator;
		this.start_time = start_time;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.end_time = end_time;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.state = state;
		this.organizer_description = organizer_description;
		this.type = type;
		this.id = id;
		this.organizer_name = organizer_name;
		this.background_image = background_image;

	}

}