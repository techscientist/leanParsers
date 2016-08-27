import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String type;
	public String privacy;
	public String background_image;
	public int id;
	public String start_time;
	public String organizer_name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String logo;
	public String topic;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String organizer_description;
	public String timezone;
	public String schedule_published_on;
	public String end_time;
	public CreatorModel _creator;
	public String state;
	public String description;
	public String location_name;

	public RootModel(VersionModel version, String type, String privacy, String background_image, int id, String start_time, String organizer_name, String email, Call_for_papersModel call_for_papers, String code_of_conduct, String logo, String topic, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String name, String organizer_description, String timezone, String schedule_published_on, String end_time, CreatorModel creator, String state, String description, String location_name) {

		this._version = version;
		this.type = type;
		this.privacy = privacy;
		this.background_image = background_image;
		this.id = id;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.topic = topic;
		this._copyright = copyright;
		this.social_links = social_links;
		this.name = name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._creator = creator;
		this.state = state;
		this.description = description;
		this.location_name = location_name;

	}

}