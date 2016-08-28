import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String privacy;
	public String start_time;
	public String logo;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String description;
	public String name;
	public String end_time;
	public String topic;
	public String email;
	public String organizer_description;
	public String type;
	public int id;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String location_name;
	public String state;
	public String timezone;
	public String organizer_name;
	public CreatorModel _creator;

	public RootModel(VersionModel version, String privacy, String start_time, String logo, String schedule_published_on, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String description, String name, String end_time, String topic, String email, String organizer_description, String type, int id, String background_image, Call_for_papersModel call_for_papers, String code_of_conduct, String location_name, String state, String timezone, String organizer_name, CreatorModel creator) {

		this._version = version;
		this.privacy = privacy;
		this.start_time = start_time;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._copyright = copyright;
		this.description = description;
		this.name = name;
		this.end_time = end_time;
		this.topic = topic;
		this.email = email;
		this.organizer_description = organizer_description;
		this.type = type;
		this.id = id;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.state = state;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this._creator = creator;

	}

}