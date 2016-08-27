import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String privacy;
	public String background_image;
	public String timezone;
	public VersionModel _version;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String state;
	public String schedule_published_on;
	public String topic;
	public String description;
	public String email;
	public String organizer_name;
	public String type;
	public String organizer_description;
	public String name;
	public String location_name;
	public String start_time;
	public int id;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(CreatorModel creator, String privacy, String background_image, String timezone, VersionModel version, String logo, String end_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, String state, String schedule_published_on, String topic, String description, String email, String organizer_name, String type, String organizer_description, String name, String location_name, String start_time, int id, String code_of_conduct, ArrayList<Social_linksModel> social_links) {

		this._creator = creator;
		this.privacy = privacy;
		this.background_image = background_image;
		this.timezone = timezone;
		this._version = version;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.description = description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.name = name;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;

	}

}